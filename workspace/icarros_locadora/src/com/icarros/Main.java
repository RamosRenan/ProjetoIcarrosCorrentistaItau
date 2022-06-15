package com.icarros;

import java.sql.SQLException;
import com.icarros.conn.mysql.ConnMySql;
import com.icarros.conn.mysql.StartApp;
import com.icarros.general.StringsUtils;

/**
 * @author renan barbosa
 *
 * calsse de incialização do app e verificação de conexão com banco de dados
 */
public class Main {	
	
	public static void main(String[] args) throws SQLException
	{
		// cria conexão com banco de dados
		new ConnMySql();
		if(ConnMySql.isConnected())
		{
			System.out.println("Connected !");
			StartApp app =  new  StartApp();
			app.start();
		}
		else
		{
			System.out.println(StringsUtils.DB_NOT_CONNECTED);
		}
	}

}

 