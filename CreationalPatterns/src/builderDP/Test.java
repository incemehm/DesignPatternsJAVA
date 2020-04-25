package builderDP;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

        ConstructionMaster constructionMaster;
        ProjectOwner owner = new ProjectOwner();

        // Hire a beginner construction master
        constructionMaster = new BeginnerConstMaster();

        // Build house with a beginner construction master
        owner.BuildHouse(constructionMaster);

        System.out.println(constructionMaster.GetHouse());

        // Hire a mid-level construction master
        constructionMaster = new MidLevelConstMaster();

        // Build house with a mid-level construction master
        owner.BuildHouse(constructionMaster);

        System.out.println(constructionMaster.GetHouse());

        // Hire a experienced construction master
        constructionMaster = new ExperiencedConstMaster();

        // Build house with a experienced construction master
        owner.BuildHouse(constructionMaster);

        System.out.println(constructionMaster.GetHouse());
	}

}
