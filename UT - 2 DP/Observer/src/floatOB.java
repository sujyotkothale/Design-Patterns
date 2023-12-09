public class floatOB  implements observer{
    float value;
    Subject sub;
    floatOB(Subject s){
        sub = s;
        value = (float) sub.value;
    }

    @Override
    public void checkForUpdates() {
        value = (float) sub.value;
        System.out.println("Float value : "+value);
    }    
    
}
