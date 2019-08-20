// This file was generated by Mendix Modeler 7.23.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package communitycommons.proxies.constants;

import com.mendix.core.Core;

public class Constants
{
	// These are the constants for the CommunityCommons module

	/**
	* If this constant is set to 'true', old locks will be released automatically. Set this constant to 'false' if community commons locking is not used. Use true in all other cases. 
	*/
	public static boolean getenableReleaseLockEvent()
	{
		return (java.lang.Boolean)Core.getConfiguration().getConstantValue("CommunityCommons.enableReleaseLockEvent");
	}
}