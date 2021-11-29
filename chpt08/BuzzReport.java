public class BuzzReport extends Report {
    
    public void runReport() {
        super.runReport();
        System.out.println("<BuzzReport> specific report");
    }
    
    public static void main(String[] args) {
        BuzzReport br = new BuzzReport();
        br.runReport();
    }
}
