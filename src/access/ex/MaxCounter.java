package access.ex;

public class MaxCounter {

    private int count=0;
    private int max;

    public MaxCounter(int max) {
        this.max=max;
    }


    public void increment(){
        if (isCountValid()){
            count++;
        }else {
            System.out.println("최대값을 초과했습니다");
        }
    }

    private boolean isCountValid(){
        return count < max;
    }

    public int getCount(){
        return count;
    }

}
