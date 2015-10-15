package textview;

import java.util.Scanner;

import minigame.IView;

public class TextView implements IView {

	private Scanner in = new Scanner(System.in);

	@Override
	public void printSystemMessage(String message) {
		System.out.print(message);
	}

	@Override
	public void printSystemMessageln(String message) {
		System.out.println(message);
	}

	@Override
	public void printSystemMessageFormat(String message, Object... args) {
		System.out.format(message, args);
	}

	@Override
	public void printSelectList(String[] selectList) {
		for (int i = 0; i < selectList.length; i++) {
			System.out.println(selectList[i]);
		}
	}

	@Override
	public int getSelectIndex() {
		int input = in.nextInt();
		return input;
	}

}