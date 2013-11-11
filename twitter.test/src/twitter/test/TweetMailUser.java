package twitter.test;

import twitter4j.User;
import twitter4j.UserList;

/**
 * @author kevinmckenna
 * Retrieves the name of a new user
 * A user will be created once an e-mail address is entered
 *
 */

public abstract class TweetMailUser implements UserList {

	/**
	 * Default serial version for default configuration
	 */
	private static final long serialVersionUID = 1L;
	
	/* Returns the id of the user
	 * @see twitter4j.UserList#getId()
	 */
	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return 0;
	}

	/* Returns the name of the user
	 * @see twitter4j.UserList#getName()
	 */
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	
	/* (non-Javadoc)
	 * @see twitter4j.UserList#getUser()
	 */
	@Override
	public User getUser() {
		// TODO Auto-generated method stub
		return null;
	}

}
