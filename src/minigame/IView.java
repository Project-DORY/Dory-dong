package minigame;

public interface IView {
	public void printSystemMessage(String message);
	public void printSystemMessageln(String message);
	public void printSystemMessageFormat(String message, Object... args);
	public void printSelectList(String[] selectList);
	public int getSelectIndex();
}
