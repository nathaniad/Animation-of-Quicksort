import java.util.concurrent.locks.*;
import java.awt.geom.*;
import javax.swing.*;
import java.awt.*;
public class Quicksort {
    private int[] a;
    private int markedPosition = -1;
    private int pivotPosition = -1;
    private int left = -1;
    private int right = -1;
    private Lock sortStateLock;
    private JComponent component;
    private static final int DELAY = 100;

    public Quicksort(int[] a, JComponent component){
        this.a = a;
        sortStateLock = new ReentrantLock();
        this.component = component;
    }
    public void pause(int steps) throws InterruptedException{
        component.repaint();
        Thread.sleep(steps * DELAY);
    }

    public void draw(Graphics2D g2){
        sortStateLock.lock();
        try{
            int deltaX = component.getWidth() / a.length;
            for(int i = 0; i < a.length; i++){
                if(i == pivotPosition)
                    g2.setColor(Color.RED);
                else if(i == markedPosition || i == left || i == right)
                    g2.setColor(Color.MAGENTA);
                else
                    g2.setColor(Color.BLACK);

                g2.draw(new Line2D.Double(i * deltaX, 0, i * deltaX, a[i]));
            }
        }finally{
            sortStateLock.unlock();
        }
    }

    public void sort() throws InterruptedException{
        quickSort(0,a.length - 1);
    }
    private void quickSort(int low, int high) throws InterruptedException{
        if(low >= high) return;
        int p = partition(low, high);
        quickSort(low, p - 1);
        quickSort(p + 1, high);
    }

    private int partition(int low, int high) throws InterruptedException{
        pivotPosition = high;
        int pivot = a[high];
        int i = low;

        for(int j = low; j < high; j++){
            markedPosition = j;
            left = i;
            right = high;

            pause(2);

            if(a[j] < pivot){
                swap(i,j);
                i++;
            }
        }
        swap(i, high);
        pause(2);
        return i;
    }
    private void swap(int i , int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
