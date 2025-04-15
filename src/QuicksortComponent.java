import javax.swing.*;
import java.awt.*;
public class QuicksortComponent extends JComponent{
    private Quicksort sorter;

    public void paintComponent(Graphics g){
        if(sorter == null) return;
        Graphics2D g2 = (Graphics2D) g;
        sorter.draw(g2);
    }
    public void startAnimation(){
        int[] values = ArrayUtil.randomArray(30,0,300);
        sorter = new Quicksort(values, this);

        class AnimationRunnable implements Runnable{
            public void run(){
                try{
                    sorter.sort();
                }catch(InterruptedException e){}
            }
        }
        Thread t = new Thread(new AnimationRunnable());
        t.start();
    }
}
