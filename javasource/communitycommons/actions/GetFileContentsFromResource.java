// This file was generated by Mendix Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package communitycommons.actions;

import java.io.File;
import java.io.FileInputStream;
import com.mendix.core.Core;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;
import com.mendix.systemwideinterfaces.core.IMendixObject;

/**
 * Set the contents of a FileDocument with the contents of a file which is a resource.
 */
public class GetFileContentsFromResource extends CustomJavaAction<java.lang.Boolean>
{
	private java.lang.String filename;
	private IMendixObject __fileDocument;
	private system.proxies.FileDocument fileDocument;

	public GetFileContentsFromResource(IContext context, java.lang.String filename, IMendixObject fileDocument)
	{
		super(context);
		this.filename = filename;
		this.__fileDocument = fileDocument;
	}

	@java.lang.Override
	public java.lang.Boolean executeAction() throws Exception
	{
		this.fileDocument = __fileDocument == null ? null : system.proxies.FileDocument.initialize(getContext(), __fileDocument);

		// BEGIN USER CODE
		File myFile = new File(Core.getConfiguration().getResourcesPath() + 
				File.separator + filename);

		FileInputStream fis = new FileInputStream(myFile);
		Core.storeFileDocumentContent(getContext(), fileDocument.getMendixObject(), 
				filename, fis);
		
		return true;
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@java.lang.Override
	public java.lang.String toString()
	{
		return "GetFileContentsFromResource";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
