package mementoDP;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

        Monitor monitor = new Monitor();

        ScreenSaver screenSaver = new ScreenSaver("Colorful Spring", 60);

        monitor.LastActiveState = screenSaver.Save();

        System.out.println("Current theme: " + screenSaver.Theme);
        System.out.println("Last theme: " + monitor.LastActiveState.Theme);
        System.out.println("-----------------------");

        screenSaver.Theme = "Black Clouds";

        System.out.println("Current theme: " + screenSaver.Theme);
        System.out.println("Last theme: " + monitor.LastActiveState.Theme);
        System.out.println("-----------------------");

        System.out.println("Restoring last theme!");
        screenSaver.Restore(monitor.LastActiveState);

        System.out.println("Current theme: " + screenSaver.Theme);
        System.out.println("Last theme: " + monitor.LastActiveState.Theme);
        System.out.println("-----------------------");
	}
}
