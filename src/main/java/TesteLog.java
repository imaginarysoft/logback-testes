import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import org.slf4j.Marker;
import org.slf4j.MarkerFactory;
import static ch.qos.logback.classic.ClassicConstants.FINALIZE_SESSION_MARKER;




public class TesteLog 
{
	/**
	 * 
	 * http://logback.qos.ch/manual/appenders.html
	 * 
	 * http://mailman.qos.ch/pipermail/logback-user/2012-April/003089.html
	 * 
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		Logger logger = LoggerFactory.getLogger(TesteLog.class);
		Marker SMTP_TRIGGER; 
		
		SMTP_TRIGGER = MarkerFactory.getMarker("SMTP_TRIGGER");
	
		SMTP_TRIGGER.add(FINALIZE_SESSION_MARKER);
		
		  /*** 
		MDC.put("dominio", "clienteA"); 
		MDC.put("app" , "appPonto") ; 
		MDC.put("key" , "1A2A") ; 	
		logger.info("TESTE") ; 	
		logger.error("OLA" );
		logger.debug(" cliente A -> OLA" );
		logger.error(SMTP_TRIGGER, "A-Teste enviador email ");
		
		//logger.info(SMTP_TRIGGER, "A-Teste enviador email ");
				
		 MDC.clear();  
		 */
		
		MDC.put("dominio", "clienteB"); 
		MDC.put("app" , "apptask") ; 	
		MDC.put("key" , "1B2B") ; 	
		logger.info("TESTANDO ") ; 	
		logger.error("OLA TESTE");
		logger.debug("TESTE ..............................");		
		
		
	   logger.error(SMTP_TRIGGER, "Teste enviador email - B ");
		
		try {
			
			throw new IllegalArgumentException("Teste de Execpion");
			
		} catch (Exception e) {

             logger.error("teste 232323", e);
		}
		
		logger.error(SMTP_TRIGGER, "B->Teste enviador email ");
	
	

		
		
	}

}
