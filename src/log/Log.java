package log;

public class Log {

		public void debug(String mensaje){
			print("DEBUG", mensaje);
		}
		
		public void info(String mensaje){
			print("INFO", mensaje);
		}
		public void warrning(String mensaje){
			print("WARRNING", mensaje);
		}
		
		public void error(String mensaje){
			print("ERRROR", mensaje);
		}
		
		public void fatal(String mensaje){
			print("FATAL", mensaje);
		}
		
				
		private void print(String categoria, String mensaje) {
			System.out.println(categoria + ": "+ mensaje);
		}
}
