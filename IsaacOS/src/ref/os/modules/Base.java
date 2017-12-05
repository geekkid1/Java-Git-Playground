package ref.os.modules;

import java.util.ArrayList;
import java.util.Arrays;

import ref.os.Module;

public class Base implements Module {
	ArrayList<String> commands = new ArrayList<String>(Arrays.asList("load","quit","list"));
	@Override
	public void runCommand(String cmd) {
		if (commands.contains(cmd)) {
			
		} else {
			System.out.println("System does not recognize \"" + cmd + "\"");
		}
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<String> getCmds() {
		
		return commands;
	}

}
