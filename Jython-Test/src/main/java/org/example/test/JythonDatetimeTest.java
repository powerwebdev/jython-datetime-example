package org.example.test;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import java.sql.Timestamp;
import java.util.Date;

public class JythonDatetimeTest {

	public static void main(String[] args) {
		try {
			ScriptEngine engine = new ScriptEngineManager().getEngineByName("python");
			engine.eval("import datetime");
			engine.eval("from java.lang import System");
			engine.eval("print datetime.datetime.now()");
			engine.eval("System.out.println(datetime.datetime.now())");
			System.out.println(new Timestamp(new Date().getTime()));
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
