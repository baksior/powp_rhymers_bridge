package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stack.StackInterface;

/**
 * @author Piotr
 * Class extends default stack functionality
 */
public class HanoiRhymer extends DefaultCountingOutRhymer {
	
	public HanoiRhymer() {
		super();
	}

	public HanoiRhymer(StackInterface intLinkedList) {
		super(intLinkedList);
	}

	private static final int DEFAULT_VALUE = 0;
	int totalRejected = DEFAULT_VALUE;

	/**
	 * @return count rejected value
	 */
	protected int reportRejected() {
		return totalRejected;
	}

	/* (non-Javadoc)
	 * @see edu.kis.vh.nursery.DefaultCountingOutRhymer#countIn(int)
	 */
	@Override
	public void countIn(int in) {
		if (!callCheck() && in > peekaboo())
			totalRejected++;
		else
			super.countIn(in);
	}
}