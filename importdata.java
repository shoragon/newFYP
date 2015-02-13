import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;

//import org.apache.commons.logging.Log;
//import org.apache.commons.logging.LogFactory;

import com.google.gdata.client.GoogleService;
import com.google.gdata.client.authn.oauth.GoogleOAuthHelper;
import com.google.gdata.client.authn.oauth.GoogleOAuthParameters;
import com.google.gdata.client.authn.oauth.OAuthException;
import com.google.gdata.client.authn.oauth.OAuthHmacSha1Signer;
import com.google.gdata.client.authn.oauth.OAuthRsaSha1Signer;
import com.google.gdata.client.authn.oauth.OAuthSigner;
import com.google.gdata.client.spreadsheet.SpreadsheetService;
import com.google.gdata.data.BaseEntry;
import com.google.gdata.data.BaseFeed;
import com.google.gdata.data.Feed;
import com.google.gdata.util.AuthenticationException;
import com.google.gdata.util.ServiceException;

public class importdata{
	/**
	    * Log in to Google, with the OAuth2 authentication
	    * 
	    * @param clientID client ID received from registering the application with Google
	           * @param clientSecret client Secret received from registering the application with Google
	    * @throws AuthenticationException if the service is unable to validate the
	    *         oauth2 parameters.
	    */
	public void loginOAuth2(String clientID, String clientSecret)
		       throws AuthenticationException {
		 String SCOPES = "https://docs.google.com/feeds https://spreadsheets.google.com/feeds";
		// STEP 1: Set up the OAuth objects

	    // You first need to initialize a few OAuth-related objects.
	    // GoogleOAuthParameters holds all the parameters related to OAuth.
	    // OAuthSigner is responsible for signing the OAuth base string.
	    GoogleOAuthParameters oauthParameters = new GoogleOAuthParameters();
	    // Set your OAuth Consumer Key (which you can register at
	    // https://www.google.com/accounts/ManageDomains).
	    oauthParameters.setOAuthConsumerKey(clientID);
	    // Initialize the OAuth Signer.  
	    OAuthSigner signer = null;
	    oauthParameters.setOAuthConsumerSecret(clientSecret);
	    signer = new OAuthHmacSha1Signer();
	    // Finally create a new GoogleOAuthHelperObject.  This is the object you
	     // will use for all OAuth-related interaction.
	     GoogleOAuthHelper oauthHelper = new GoogleOAuthHelper(signer);
	     
	     // This method also makes a request to get the unauthorized request token,
	      // and adds it to the oauthParameters object, along with the token secret
	      // (if it is present).
	      try {
	    	  	oauthHelper.getUnauthorizedRequestToken(oauthParameters);
	      		} catch (OAuthException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	      		}
	    // Get the authorization url.  The user of your application must visit
	      // this url in order to authorize with Google.  If you are building a
	      // browser-based application, you can redirect the user to the authorization
	      // url.
	      String requestUrl = oauthHelper.createUserAuthorizationUrl(oauthParameters);
	      System.out.println(requestUrl);
	      System.out.println("Please visit the URL above to authorize your OAuth "
	          + "request token.  Once that is complete, press any key to "
	          + "continue...");
	      try {
	    	    System.in.read();
	    	   } catch (IOException e1) {
	    	    // TODO Auto-generated catch block
	    	    e1.printStackTrace();
	    	   }
	      
	}

}