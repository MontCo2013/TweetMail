package twitter.test;

import twitter4j.*;
import twitter4j.api.ListsResources;

/**
 * Creates a new list of users.
 * Twitter status updates will be retrieved from each member in the list
 * @author kevinmckenna
 * 
 */
public abstract class TweetMailList implements ListsResources{

	/**
	 * Adds a user to the created list
	 */
	@Override
	public UserList addUserListMembers(long arg0, String arg1, String[] arg2)
			throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Creates a new member of the list
	 * @param arg0, arg1, arg2
	 */
	@Override
	public UserList createUserListMember(String arg0, String arg1, long arg2)
			throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	
	/* 
	 * Adds more than one member to the list at a time
	 * @param arg0, arg1
	 */
	@Override
	public UserList createUserListMembers(int arg0, long[] arg1)
			throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Deletes a user from the created list
	 * @param arg0, arg1, arg2
	 */
	@Override
	public UserList deleteUserListMember(long arg0, String arg1, long arg2)
			throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Removes the entire list of members
	 * @param arg0
	 */
	@Override
	public UserList destroyUserList(int arg0) throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	/**Removes the specified member from the list
	 * @param arg0, arg1, arg2
	 */
	@Override
	public UserList destroyUserListMember(long arg0, String arg1, long arg2)
			throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}
	
	/**
	 * Show tweet timeline for members of the specified list. 
	 * @param arg0, arg1
	 */
	@Override
	public ResponseList<Status> getUserListStatuses(int arg0, Paging arg1)
			throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * List the lists of the specified user
	 * @param arg0
	 */
	@Override
	public ResponseList<UserList> getUserLists(String arg0)
			throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Displays the list of members
	 * @param arg0
	 */
	@Override
	public UserList showUserList(int arg0) throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Updates any changes made to the created list of users
	 * @param arg0, arg1, arg2
	 */
	@Override
	public UserList updateUserList(int arg0, String arg1, boolean arg2,
			String arg3) throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}


}
