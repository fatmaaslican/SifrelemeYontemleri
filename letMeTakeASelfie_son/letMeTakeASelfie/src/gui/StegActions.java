/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

/**
 *
 * @author Aslican
 */



import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

/*
 * This class handles the actions in the menu bar.  These action don't
 * do anything themselves, they just call back to the Main class.
 */
public class StegActions
{
	protected void initMenus(JFrame frame)
	{
        JMenuBar mb = new JMenuBar();
		
		frame.setJMenuBar(mb);
		
		JMenu file = new JMenu("File");
        mb.add(file);

        file.add(new OpenImageAction());
		file.add(new SaveImageAction());
        file.add(new GetMessageAction());
	}
}

/*
 * This action calls the open method to open the object to add the 
 * message to.  
 */
class OpenImageAction extends AbstractAction
{
	public void actionPerformed(ActionEvent e)
	{
		StegTest.getStegTest().openImage();
	}
	public boolean isEnabled()
	{
		return true;
	}
	
	public Object getValue(String key)
	{
        if(key.equals("MnemonicKey"))
			return (int) 'O';
		else if(key.equals("Name"))
			return "Open Image";
		else if(key.equals("ShortDescription"))
			return "Open Image";
		else if(key.equals("SmallIcon"))
			return null;
		else if(key.equals("ActionCommandKey"))
			return null;
		else if(key.equals("AcceleratorKey"))
			return KeyStroke.getKeyStroke(KeyEvent.VK_O, KeyEvent.CTRL_MASK);
		else
            return super.getValue(key);
	}
}

/*
 * This actions calls saveImage to  save the image with the encoded
 * message.
 */
class SaveImageAction extends AbstractAction
{
	public void actionPerformed(ActionEvent e)
	{
		StegTest.getStegTest().saveImage();
	}
	public boolean isEnabled()
	{
		return true;
	}
	
	public Object getValue(String key)
	{
        if(key.equals("MnemonicKey"))
			return (int) 'S';
		else if(key.equals("Name"))
			return "Save Image";
		else if(key.equals("ShortDescription"))
			return "Save Image";
		else if(key.equals("SmallIcon"))
			return null;
		else if(key.equals("ActionCommandKey"))
			return null;
		else if(key.equals("AcceleratorKey"))
			return KeyStroke.getKeyStroke(KeyEvent.VK_S, KeyEvent.CTRL_MASK);
		else
            return super.getValue(key);
	}
}

/*
 * This action calls the getMessage method to get the encoded message out 
 * of an image.
 */
class GetMessageAction extends AbstractAction
{
	public void actionPerformed(ActionEvent e)
	{
		StegTest.getStegTest().getMessage();
	}
	public boolean isEnabled()
	{
		return true;
	}
	
	public Object getValue(String key)
	{
        if(key.equals("MnemonicKey"))
			return (int) 'G';
		else if(key.equals("Name"))
			return "Get Message";
		else if(key.equals("ShortDescription"))
			return "Get Message";
		else if(key.equals("SmallIcon"))
			return null;
		else if(key.equals("ActionCommandKey"))
			return null;
		else if(key.equals("AcceleratorKey"))
			return KeyStroke.getKeyStroke(KeyEvent.VK_G, KeyEvent.CTRL_MASK);
		else
            return super.getValue(key);
	}
}
