package week5;
import javax.swing.JOptionPane;
public class FindErrors {

    public static void main(String[] args){
        String[] nms = new String[3];
        int[] ages = new int[3];
        int i;
        for(i=0; i<3; ++i){
            nms[i] = JOptionPane.showInputDialog("Enter the name of the "+(i+1)+"th person");
            ages[i] = Integer.parseInt(JOptionPane.showInputDialog("Enter the age of "+(i+1)+"th person")); }

        int numTimes=0;
        for(i=0; i<3; ++i)
            if(ages[i] == 47)
                numTimes++;
        System.out.println("There are "+numTimes+" person with age 47");
    }
}
