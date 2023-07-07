
public class NewThreadEextendsThread {

	public NewThreadEextendsThread() {
		// TODO Auto-generated constructor stub
	}

	public void run() {
        long startTime = System.currentTimeMillis();
        int i = 0;
        while (true) {
            System.out.println(this.getName() + ": New Thread is running..." + i++);
            try {
                //Wait for one sec so it doesn't print too fast
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            
        }
    }

	private String getName() {
		// TODO Auto-generated method stub
		return null;
	}
}