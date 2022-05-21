import java.lang.*;
import java.awt.*;
import java.awt.event.*;


class MarvellousFrame
{
	public Frame fobj;

	public MarvellousFrame(String name)
	{
		fobj = new Frame(name);
		fobj.setSize(700,700);
		fobj.setVisible(true);


		fobj.addWindowListener(new MarvellousListene{});

	}
}

class MarvellousListener extends WindowAdapter
{
	public void windowClosing(WindowEvent obj)
	{
		System.out.println("")
	}
}