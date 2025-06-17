import java.awt.*;
import javax.swing.*;
class JTabledemo extends JFrame
{
	JTabledemo()
	{
		Container c=getContentPane();
        c.setLayout(new FlowLayout());
		String colHeads[]={"Roll No","Name",};
		String data[][]={
			{"01","mahesh",},
			{"02","tejas"},
			{"03","vikas"},
			{"04","Hrushant"}
				};
		JTable jtb=new JTable(data,colHeads);
		jtb.setBackground(Color.yellow);
		int v=ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
        int h=ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED; 
        
		JScrollPane jsp=new JScrollPane(jtb,v,h);
        c.add(jsp);

	}
	public static void main(String args[])
	{
		JTabledemo jt=new JTabledemo();
		jt.setTitle("JTableDemoProgram");
		jt.setSize(600,600);
		jt.setVisible(true);
	}
}