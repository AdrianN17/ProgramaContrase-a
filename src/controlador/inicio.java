package controlador;
import bd.conectar;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import modelo.datos;
import modelo.login;
import modelo.tele;
import static org.apache.commons.codec.binary.Base64.decodeBase64;
import static org.apache.commons.codec.binary.Base64.encodeBase64;
public class inicio {
    public login ingreso(login Login)
    {
        login log=null;
        String sql="select usuario from usuario where usuario = ? and contraseña= ? and contraseña2= ?";
        conectar conecta= new conectar();
        Connection conn = conecta.connect();
        try
        {
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1,Login.getId());
            pst.setString(2,Login.getPass());
            pst.setString(3,Login.getPass2());
            ResultSet rs = pst.executeQuery();
            
            while(rs.next())
            {
               log=new login();
               log.setId(rs.getString(1));
            }  
            rs.close();
            pst.close();
            conn.close();
            conn=null;
        }
        catch(Exception e)
        {
            System.out.println("Error al logearse "+ e.getMessage());
        }
        return log;       
    }
    
    public int registro(login Login)
    {
        int result=0;
        String sql="insert into usuario values(?,?,?)";
        conectar conecta= new conectar();
        Connection conn = conecta.connect();
        try
        {
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.setString(1, Login.getId());
            ps.setString(2, Login.getPass());
            ps.setString(3, Login.getPass2());
            
            result = ps.executeUpdate();
            ps.close();
            ps = null;
            conn.close();
            conn=null;
        }
        catch(Exception e)
        {
            System.out.println("Error al registrarse "+ e.getMessage());
        }
        return result;
    }
    
    public ArrayList getdatos(datos daa)
    {
        ArrayList<datos> listadatos=new ArrayList();
        String sql="select id,nick, contraseña, url from cuentas where usuario=?";
        conectar conecta= new conectar();
        Connection conn = conecta.connect();
        try
        {
            PreparedStatement pst=null;
            pst = conn.prepareStatement(sql);
            pst.setString(1,daa.getUsuario());
            ResultSet rs = pst.executeQuery();
            int i=1;
            while(rs.next())
            {
                datos da=new datos();
                da.setCount(i);
                da.setId(rs.getInt(1));
                da.setNick(rs.getString(2));
                da.setContraseña(decrypt(rs.getString(3)));
                da.setUrl(rs.getString(4));
                listadatos.add(da);
                i=i+1;
            }
            rs.close();
            pst.close();
            conn.close();
            conn=null;
        }
        catch(Exception e)
        {
            System.out.println("Error al obtener datos "+ e.getMessage());
        }
        
        return listadatos;
    }
    public int agregardato(datos da)
    {
        int val=0;
        String sql="insert into cuentas values(NULL,?,?,?,?)";
        conectar conecta= new conectar();
        Connection conn = conecta.connect();
        try
        {
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.setString(1, da.getUsuario());
            ps.setString(2, da.getNick());
            ps.setString(3, encrypt(da.getContraseña()));
            ps.setString(4, da.getUrl());
            
            val = ps.executeUpdate();
            ps.close();
            ps = null;
            conn.close();
            conn=null;
        }
        catch(Exception e)
        {
            System.out.println("No se pudo agregar el registro en la base de datos. Mensaje: "+ e.getMessage());
        }
        return val;
    }
    
    
    public int eliminardato(datos da)
    {
        int val=0;
        String sql="delete from cuentas where ID=? and usuario=? and nick=? ";
        conectar conecta= new conectar();
        Connection conn = conecta.connect();
        try
        {
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.setInt(1,da.getId());
            ps.setString(2, da.getUsuario());
            ps.setString(3, da.getNick());
            
            val = ps.executeUpdate();
            ps.close();
            ps = null;
            conn.close();
            conn=null;
        }
        catch(Exception e)
        {
            System.out.println("No se pudo borrar el registro en la base de datos. Mensaje: "+ e.getMessage());
        }
        return val;
    }
    
    public int editardatos(datos da)
    {
        int val=0;
        String sql="update cuentas set nick= ?, contraseña= ?, url= ? where id= ? and usuario= ?";
        conectar conecta= new conectar();
        Connection conn = conecta.connect();
        try
        {
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.setString(1, da.getNick());
            ps.setString(2, encrypt(da.getContraseña()));
            ps.setString(3, da.getUrl());
            ps.setInt(4, da.getId());
            ps.setString(5, da.getUsuario());
            val = ps.executeUpdate();
            ps.close();
            ps = null;
            conn.close();
            conn=null;
        }
        catch(Exception e)
        {
            System.out.println("No se pudo editar el registro en la base de datos. Mensaje: "+ e.getMessage());
        }
        return val;
    }
    
    public login getusuariomain(login Login)
    {
        login log=null;
        String sql="select usuario, contraseña, contraseña2 from usuario where usuario=?";
        conectar conecta= new conectar();
        Connection conn = conecta.connect();
        try
        {
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1,Login.getId());
            ResultSet rs = pst.executeQuery();
            
            while(rs.next())
            {
               log=new login();
               log.setId(rs.getString(1));
               log.setPass(rs.getString(2));
               log.setPass2(rs.getString(3));
            }  
            rs.close();
            pst.close();
            conn.close();
            conn=null;
        }
        catch(Exception e)
        {
            System.out.println("No se pudo seleccionar el registro en la base de datos. Mensaje: "+ e.getMessage());
        }
        
        return log;
    }
    
    public int cantidaddatos(login Login)
    {   int datos=0;
        String sql="select count(*) from cuentas where usuario=?";
        conectar conecta= new conectar();
        Connection conn = conecta.connect();
        try
        {
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1,Login.getId());
            ResultSet rs = pst.executeQuery();
            
            while(rs.next())
            {
                datos=rs.getInt(1);
            }
            rs.close();
            pst.close();
            conn.close();
            conn=null;
        }
        catch(Exception e)
        {
            System.out.println("No se pudo contar el registro en la base de datos. Mensaje: "+ e.getMessage());
        }
        return datos;
    }
    
    public int cambiarlogin(login Login)
    {
        int result=0;
        String sql="update usuario set contraseña=?,contraseña2=? where usuario=?";
        conectar conecta= new conectar();
        Connection conn = conecta.connect();
        try
        {
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.setString(1, Login.getPass());
            ps.setString(2, Login.getPass2());
            ps.setString(3, Login.getId());
            
            result = ps.executeUpdate();
            ps.close();
            ps = null;
            conn.close();
            conn=null;
        }
        catch(Exception e)
        {
            System.out.println("No se pudo editar el registro en la base de datos. Mensaje: "+ e.getMessage());
        }
        return result;
    }
    
    public int borrartodo(login Login)
    {
        int val=0;
        String sql="delete from cuentas where usuario=?";
        conectar conecta= new conectar();
        Connection conn = conecta.connect();
        try
        {
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.setString(1, Login.getId());
            
            val = ps.executeUpdate();
            ps.close();
            ps = null;
            conn.close();
            conn=null;
        }
        catch(Exception e)
        {
            System.out.println("No se pudo editar el registro en la base de datos. Mensaje: "+ e.getMessage());
        }
        return val;
    }
    
    
    public String hashPassword(String password) throws NoSuchAlgorithmException{
        MessageDigest md = MessageDigest.getInstance("SHA");
        md.update(password.getBytes());
        byte[] b = md.digest();
        StringBuffer sb = new StringBuffer();
        for(byte b1 : b){
            sb.append(Integer.toHexString(b1 & 0xff).toString());
        }
        return sb.toString();
    }
    
    public int eliminarcuenta(login Login)
    {
        int val=0;
        String sql="delete from usuario where usuario= ?";
        conectar conecta= new conectar();
        Connection conn = conecta.connect();
        try
        {
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.setString(1, Login.getId());
            val = ps.executeUpdate();
            ps.close();
            ps = null;
            conn.close();
            conn=null;
        }
        catch(Exception e)
        {
            System.out.println("No se pudo editar el registro en la base de datos. Mensaje: "+ e.getMessage());
        }
        return val;
    }
    public String encrypt(String cleartext) throws Exception {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            SecretKeySpec skeySpec = new SecretKeySpec("92AE31A79FEEB2A3".getBytes(), "AES");
            IvParameterSpec ivParameterSpec = new IvParameterSpec("0123456789ABCDEF".getBytes());
            cipher.init(Cipher.ENCRYPT_MODE, skeySpec, ivParameterSpec);
            byte[] encrypted = cipher.doFinal(cleartext.getBytes());
            return new String(encodeBase64(encrypted));
    }
 
    public String decrypt(String encrypted) throws Exception {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            SecretKeySpec skeySpec = new SecretKeySpec("92AE31A79FEEB2A3".getBytes(), "AES");
            IvParameterSpec ivParameterSpec = new IvParameterSpec("0123456789ABCDEF".getBytes());
            byte[] enc = decodeBase64(encrypted);
            cipher.init(Cipher.DECRYPT_MODE, skeySpec, ivParameterSpec);
            byte[] decrypted = cipher.doFinal(enc);
            return new String(decrypted);
    }
    
   public ArrayList gettelefono(tele te)
   {
        ArrayList<tele> listatele=new ArrayList();
        String sql="select ID,Telefono, Contacto, Detalle from telefonos where USUARIO= ?";
        conectar conecta= new conectar();
        Connection conn = conecta.connect();
        try
        {
            PreparedStatement pst=null;
            pst = conn.prepareStatement(sql);
            pst.setString(1,te.getUsuario());
            ResultSet rs = pst.executeQuery();
            int i=1;
            while(rs.next())
            {
                tele tee=new tele();
                tee.setCount(i);
                tee.setId(rs.getInt(1));
                tee.setTelefono(rs.getString(2));
                tee.setContacto(rs.getString(3));
                tee.setDetalle(rs.getString(4));
                listatele.add(tee);
                i=i+1;
            }
            rs.close();
            pst.close();
            conn.close();
            conn=null;
        }
        catch(Exception e)
        {
            System.out.println("Error al obtener datos "+ e.getMessage());
        }
       
       return listatele;
   }
   public int ingresartele(tele te)
   {    int val=0;
        String sql="insert into telefonos values(NULL,?,?,?,?)";
        conectar conecta= new conectar();
        Connection conn = conecta.connect();
        try
        {
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.setString(1, te.getUsuario());
            ps.setString(2, te.getTelefono());
            ps.setString(3, te.getContacto());
            ps.setString(4, te.getDetalle());
            val = ps.executeUpdate();
            ps.close();
            ps = null;
            conn.close();
            conn=null;
        }
        catch(Exception e)
        {
            System.out.println("Error al ingresar datos "+ e.getMessage());
        }
        return val;
   }
   public int editartele(tele te)
   {
        int val=0;
        String sql="update telefonos set Telefono=?, Contacto=?, Detalle=? where USUARIO=? and id=?";
        conectar conecta= new conectar();
        Connection conn = conecta.connect();
        try
        {
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.setString(1, te.getTelefono());
            ps.setString(2, te.getContacto());
            ps.setString(3, te.getDetalle());
            ps.setString(4, te.getUsuario());
            ps.setInt(5, te.getId());
            val = ps.executeUpdate();
            ps.close();
            ps = null;
            conn.close();
            conn=null;
        }
        catch(Exception e)
        {
            System.out.println("No se pudo editar el registro en la base de datos. Mensaje: "+ e.getMessage());
        }
        return val;
   }
   public int eliminartele(tele te)
   {
        int val=0;
        String sql="delete from telefonos where USUARIO= ? and id=?";
        conectar conecta= new conectar();
        Connection conn = conecta.connect();
        try
        {
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.setString(1, te.getUsuario());
            ps.setInt(2, te.getId());
            val = ps.executeUpdate();
            ps.close();
            ps = null;
            conn.close();
            conn=null;
        }
        catch(Exception e)
        {
            System.out.println("No se pudo eliminar el registro en la base de datos. Mensaje: "+ e.getMessage());
        }
        return val;
   }
   public int borrarteletotal(login lo)
   {
        int val=0;
        String sql="delete from telefonos where USUARIO= ?";
        conectar conecta= new conectar();
        Connection conn = conecta.connect();
        try
        {
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.setString(1, lo.getId());
            val = ps.executeUpdate();
            ps.close();
            ps = null;
            conn.close();
            conn=null;
        }
        catch(Exception e)
        {
            System.out.println("No se pudo eliminar el registro en la base de datos. Mensaje: "+ e.getMessage());
        }
        return val;
   }
   
   public boolean validarusuario(String usu)
   {
        boolean val=false;
        String sql="select usuario from usuario where usuario=?";
        conectar conecta= new conectar();
        Connection conn = conecta.connect();
        try
        {
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, usu);
            ResultSet rs = pst.executeQuery();
            
            while(rs.next())
            {
               val=true;
            }  
            rs.close();
            pst.close();
            conn.close();
            conn=null;
        }
        catch(Exception e)
        {
            
        }
       
        return val;
   }
    
}
