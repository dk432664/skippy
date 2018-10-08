//eventhandle2
Import java.awt.FlowLayout;
Import javax.swing.JFrame;
Import javax.swing.JLabel;

Public class deep extends JFrame{
Private JLabel x;
Public deep (){
Super(“the title is”);
setLayout(new FlowLayout());
x=new JLabel(“the ans is”);
x.setToolTipText(“hover over the mouse “);
add(x);
import javax.swing.JFrame;
public class abc{
Public static void main(String[] args)
{
Deep as=new deep();
As.setDefaultCloseOPeration(JFrame.EXIT_ON_CLOSE);
As.setSize(234,123);
As.setVisible(true);

}
}
