package pc룸;

public class Timer extends Thread {
	
	
	private boolean stop = true;
	public void setStop(boolean stop) { this.stop = stop; }

	@Override
	public void run() {
		
		// db에 저장된 시간(초) 가져오기 
		
		int time = 10;
		while( stop ) {
			time--;
			try{ Thread.sleep(1000) ; }
			catch (Exception e) {}
			
			for (int i = 0; i < 80; i++) System.out.println("");
			
			int 시 = time/3600;
			int 분 = time/60;
			int 초 = time - (60*분);
			
			System.out.printf( " 남은시간 : %2d : %2d : %2d \n" , 시 , 분 , 초);
			
			if( time == 0 ) { 
				stop=false;   
				실행.getInstance().setStop(false);
				
			}
		}
		
		// 남은시간을 다시 db에 저장 
		
	}
}
