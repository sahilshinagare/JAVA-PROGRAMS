import java.lang.*;
import java.awt.*;


class MarvellousFrame
{
	public Frame fobj;

	public MarvellousFrame(String name)
	{
		fobj = new frame(name);
		fobj.setSize(600,600);
		fobj.setVisible(true);

	}
}


class FrameDemo2
{
	public static void main(String argv[])
	{
		System.out.println("print the data on consle");


		MarvellousFrame mobj = new MarvellousFrame("PPA");
	}
}