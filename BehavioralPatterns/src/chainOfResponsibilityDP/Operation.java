package chainOfResponsibilityDP;

public abstract class Operation {
	private Operation next;

    public Operation SetNextOperation(Operation operation)
    {
        this.next = operation;
        return operation;
    }

    public void Start(String word)
    {
        String result = DoProcess(word);

        if (next != null)
        {
            next.Start(result);
        }
    }

    protected abstract String DoProcess(String word);

}
