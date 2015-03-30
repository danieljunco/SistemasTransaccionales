package prodAndes.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import prodAndes.dao.ConsultaDAO;
import junit.framework.TestCase;

public class TestProdAndes extends TestCase
{
	public boolean pruebaUnicidad()
	{
		ConsultaDAO cd = new ConsultaDAO();
		cd.inicializar();
		boolean err = false;
		try
		{
			cd.establecerConexion(cd.URLConexion, cd.usuario, cd.pass);
			Connection conexion = cd.conexion;
			System.out.println(cd.pass);
			PreparedStatement ps = conexion.prepareStatement("INSERT INTO "+cd.usuario+".MATERIAS_PRIMAS (CODIGO, NOMBRE, UNIDAD_DE_MEDIDA, CANTIDAD) VALUES ( '1','Vidrio','10 Cajas',15)");
			PreparedStatement ps2 = conexion.prepareStatement("INSERT INTO ISIS2304221510.MATERIAS_PRIMAS (CODIGO, NOMBRE, UNIDAD_DE_MEDIDA, CANTIDAD) VALUES ('1','Madera','20 Cajas',10)");
			ps.executeUpdate();
			ps2.executeUpdate();
		}
		catch (SQLException e)
		{
			System.out.println(e.getMessage());
			// TODO Auto-generated catch block
			err = true;
		}
		
		return err;
	}
	
	public boolean pruebaUnicidad2()
	{
		ConsultaDAO cd = new ConsultaDAO();
		cd.inicializar();
		boolean err = false;
		try
		{
			cd.establecerConexion(cd.URLConexion, cd.usuario, cd.pass);
			Connection conexion = cd.conexion;
			System.out.println(cd.pass);
			PreparedStatement ps = conexion.prepareStatement("INSERT INTO ISIS2304221510.COMPONENTES (CODIGO, NOMBRE, CANTIDAD) VALUES ( '0001','Tarjeta de Red',15)");
			PreparedStatement ps2 = conexion.prepareStatement("INSERT INTO ISIS2304221510.COMPONENTES (CODIGO, NOMBRE, UNIDAD_DE_MEDIDA, CANTIDAD) VALUES ('0001','Tarjeta de Video',10)");
			ps.executeUpdate();
			ps2.executeUpdate();
		}
		catch (SQLException e)
		{
			System.out.println(e.getMessage());
			// TODO Auto-generated catch block
			err = true;
		}
		
		return err;
	}
	
	public boolean pruebaUnicidad3()
	{
		ConsultaDAO cd = new ConsultaDAO();
		cd.inicializar();
		boolean err = false;
		try
		{
			cd.establecerConexion(cd.URLConexion, cd.usuario, cd.pass);
			Connection conexion = cd.conexion;
			System.out.println(cd.pass);
			PreparedStatement ps = conexion.prepareStatement("INSERT INTO ISIS2304221510.ESTACIONES_PRODUCCION (CODIGO, CAPACIDAD) VALUES ( '0002',15)");
			PreparedStatement ps2 = conexion.prepareStatement("INSERT INTO ISIS2304221510.ESTACIONES_PRODUCCION (CODIGO, CAPACIDAD) VALUES ('0002',10)");
			ps.executeUpdate();
			ps2.executeUpdate();
		}
		catch (SQLException e)
		{
			System.out.println(e.getMessage());
			// TODO Auto-generated catch block
			err = true;
		}
		
		return err;
	}
	
	public boolean pruebaUnicidad4()
	{
		ConsultaDAO cd = new ConsultaDAO();
		cd.inicializar();
		boolean err = false;
		try
		{
			cd.establecerConexion(cd.URLConexion, cd.usuario, cd.pass);
			Connection conexion = cd.conexion;
			System.out.println(cd.pass);
			PreparedStatement ps = conexion.prepareStatement("INSERT INTO ISIS2304221510.PRODUCTOS (CODIGO, NOMBRE, ESTADO) VALUES ( '0001','Mouse Dell','Finalizado')");
			PreparedStatement ps2 = conexion.prepareStatement("INSERT INTO ISIS2304221510.PRODUCTOS (CODIGO, NOMBRE, ESTADO) VALUES ('0001','Teclado Dell','En Proceso')");
			ps.executeUpdate();
			ps2.executeUpdate();
		}
		catch (SQLException e)
		{
			System.out.println(e.getMessage());
			// TODO Auto-generated catch block
			err = true;
		}
		
		return err;
	}
	
	public boolean pruebaFKs()
	{
		ConsultaDAO cd = new ConsultaDAO();
		cd.inicializar();
		boolean err = false;
		try
		{
			cd.establecerConexion(cd.URLConexion, cd.usuario, cd.pass);
			Connection conexion = cd.conexion;
			PreparedStatement ps = conexion.prepareStatement("INSERT INTO ISIS2304221510.ADMINISTRADORES (EMAIL) VALUES ('dsjunco@gmail.com')");
			PreparedStatement ps2 = conexion.prepareStatement("INSERT INTO ISIS2304221510.ADMINISTRADORES (EMAIL) VALUES ('daniel@gmail.com')");
			PreparedStatement ps3 = conexion.prepareStatement("DELETE FROM ISIS2304221510.ADMINISTRADORES WHERE EMAIL='dsjunco@gmail.com'");
			PreparedStatement ps4 = conexion.prepareStatement("DELETE FROM ISIS2304221510.USUARIOS WHERE EMAIL='dsjunco@gmail.com'");
			ps.executeUpdate();
			ps2.executeUpdate();
		}
		catch (SQLException e)
		{
			System.out.println(e.getMessage());
			// TODO Auto-generated catch block
			err = true;
		}
		
		return err;
	}
	
	public boolean pruebaFKs2()
	{
		ConsultaDAO cd = new ConsultaDAO();
		cd.inicializar();
		boolean err = false;
		try
		{
			cd.establecerConexion(cd.URLConexion, cd.usuario, cd.pass);
			Connection conexion = cd.conexion;
			PreparedStatement ps = conexion.prepareStatement("INSERT INTO ISIS2304221510.ADMINISTRADORES (EMAIL) VALUES ('dsjunco@gmail.com')");
			PreparedStatement ps2 = conexion.prepareStatement("INSERT INTO ISIS2304221510.ADMINISTRADORES (EMAIL) VALUES ('daniel@gmail.com')");
			PreparedStatement ps3 = conexion.prepareStatement("DELETE FROM ISIS2304221510.ADMINISTRADORES WHERE EMAIL='dsjunco@gmail.com'");
			PreparedStatement ps4 = conexion.prepareStatement("DELETE FROM ISIS2304221510.USUARIOS WHERE EMAIL='dsjunco@gmail.com'");
			ps.executeUpdate();
			ps2.executeUpdate();
		}
		catch (SQLException e)
		{
			System.out.println(e.getMessage());
			// TODO Auto-generated catch block
			err = true;
		}
		
		return err;
	}
	
	public boolean pruebaChecks()
	{
		ConsultaDAO cd = new ConsultaDAO();
		cd.inicializar();
		boolean err = false;
		try
		{
			cd.establecerConexion(cd.URLConexion, cd.usuario, cd.pass);
			Connection conexion = cd.conexion;
			PreparedStatement ps = conexion.prepareStatement("INSERT INTO ISIS2304221510.COMPONENTES (CODIGO, NOMBRE, CANTIDAD) VALUES ('0001','Tarjeta De Video')");
			ps.executeUpdate();
		}
		catch (SQLException e)
		{
			System.out.println(e.getMessage());
			// TODO Auto-generated catch block
			err = true;
		}
		
		return err;
	}
	
	public boolean pruebaChecks2()
	{
		ConsultaDAO cd = new ConsultaDAO();
		cd.inicializar();
		boolean err = false;
		try
		{
			cd.establecerConexion(cd.URLConexion, cd.usuario, cd.pass);
			Connection conexion = cd.conexion;
			PreparedStatement ps = conexion.prepareStatement("INSERT INTO ISIS2304221510.COMPONENTES (CODIGO, NOMBRE, CANTIDAD) VALUES ('0005','Tarjeta De Video','10')");
			ps.executeUpdate();
		}
		catch (SQLException e)
		{
			System.out.println(e.getMessage());
			// TODO Auto-generated catch block
			err = true;
		}
		
		return err;
	}
	
	public boolean pruebaChecks3()
	{
		ConsultaDAO cd = new ConsultaDAO();
		cd.inicializar();
		boolean err = false;
		try
		{
			cd.establecerConexion(cd.URLConexion, cd.usuario, cd.pass);
			Connection conexion = cd.conexion;
			PreparedStatement ps = conexion.prepareStatement("INSERT INTO ISIS2304221510.ESTACIONES_PRODUCCION (CODIGO, CAPACIDAD) VALUES ('0006','10')");
			ps.executeUpdate();
		}
		catch (SQLException e)
		{
			System.out.println(e.getMessage());
			// TODO Auto-generated catch block
			err = true;
		}
		
		return err;
	}
	
	public boolean pruebaChecks4()
	{
		ConsultaDAO cd = new ConsultaDAO();
		cd.inicializar();
		boolean err = false;
		try
		{
			cd.establecerConexion(cd.URLConexion, cd.usuario, cd.pass);
			Connection conexion = cd.conexion;
			PreparedStatement ps = conexion.prepareStatement("INSERT INTO ISIS2304221510.PRODUCTOS (CODIGO, NOMBRE, ESTADO) VALUES (0010,'Teclado','En Proceso')");
			ps.executeUpdate();
		}
		catch (SQLException e)
		{
			System.out.println(e.getMessage());
			// TODO Auto-generated catch block
			err = true;
		}
		
		return err;
	}
	
	public void testUnicidad()
	{
		assertTrue(pruebaUnicidad());
	}
	
	public void testFKs()
	{
		assertTrue(pruebaFKs());
	}	
	
	public void testChecks()
	{
		assertTrue(pruebaChecks());
	}
	public void testUnicidad2()
	{
		assertTrue(pruebaUnicidad());
	}
	
	public void testFKs2()
	{
		assertTrue(pruebaFKs());
	}	
	
	public void testChecks2()
	{
		assertTrue(pruebaChecks());
	}
	public void testUnicidad3()
	{
		assertTrue(pruebaUnicidad());
	}
	
	public void testFKs3()
	{
		assertTrue(pruebaFKs());
	}	
	
	public void testChecks3()
	{
		assertTrue(pruebaChecks());
	}
	public void testUnicidad4()
	{
		assertTrue(pruebaUnicidad());
	}
	
	public void testFKs4()
	{
		assertTrue(pruebaFKs());
	}	
	
	public void testChecks4()
	{
		assertTrue(pruebaChecks());
	}
	
	
	
}
