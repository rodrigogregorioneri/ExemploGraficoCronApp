package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;

@CronapiMetaData(type = "blockly")
@CronappSecurity
public class Bloco {

	public static final int TIMEOUT = 300;

	/**
	 *
	 * @return Var
	 */
	// Bloco
	public static Var ba() throws Exception {
		return new Callable<Var>() {

			private Var sp = Var.VAR_NULL;
			private Var rj = Var.VAR_NULL;
			private Var ba = Var.VAR_NULL;

			public Var call() throws Exception {
				ba = cronapi.database.Operations.query(Var.valueOf("app.entity.Estados"),
						Var.valueOf("select COUNT(e) from Estados e where e.sigla = \'ba\'"), Var.VAR_NULL);
				System.out.println(Var.valueOf("abc").getObjectAsString());
				return ba;
			}
		}.call();
	}

	/**
	 *
	 * @return Var
	 */
	// Bloco
	public static Var rj() throws Exception {
		return new Callable<Var>() {

			private Var sp = Var.VAR_NULL;
			private Var rj = Var.VAR_NULL;

			public Var call() throws Exception {
				rj = cronapi.database.Operations.query(Var.valueOf("app.entity.Estados"),
						Var.valueOf("select COUNT(e) from Estados e where e.sigla = \'rj\'"), Var.VAR_NULL);
				return rj;
			}
		}.call();
	}

	/**
	 *
	 * @return Var
	 */
	// Bloco
	public static Var sp() throws Exception {
		return new Callable<Var>() {

			private Var sp = Var.VAR_NULL;

			public Var call() throws Exception {
				sp = cronapi.database.Operations.query(Var.valueOf("app.entity.Estados"),
						Var.valueOf("select COUNT(e) from Estados e where e.sigla = \'sp\'"), Var.VAR_NULL);
				return sp;
			}
		}.call();
	}

}
