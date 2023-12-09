public class integerOB implements observer {
    int value;
    Subject sub;
    integerOB(Subject s){
        
        sub = s;
        value = (int) sub.value;
    }

    @Override
    public void checkForUpdates() {
        value = (int) sub.value;
        System.out.println("Integer value : "+value);
    }    
    
}
