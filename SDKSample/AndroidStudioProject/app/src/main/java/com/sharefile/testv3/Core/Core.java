package com.sharefile.testv3.Core;


import android.content.Context;
import android.util.Log;

import com.citrix.sharefile.api.SFSdk;
import com.citrix.sharefile.api.authentication.SFOAuth2Token;
import com.citrix.sharefile.api.authentication.SFOAuthService;
import com.citrix.sharefile.api.exceptions.SFInvalidStateException;
import com.citrix.sharefile.api.interfaces.IOAuthTokenCallback;
import com.citrix.sharefile.api.interfaces.ISFApiClient;
import com.citrix.sharefile.api.interfaces.ISFAsyncTask;
import com.citrix.sharefile.api.interfaces.ISFAsyncTaskFactory;
import com.citrix.sharefile.api.interfaces.ISFOAuthService;
import com.sharefile.testv3.PersistantToken;
import com.sharefile.testv3.SFLogger;

public class Core
{
    private static final String TAG = "Core";

    private static boolean isInitialised = false;

    public static boolean isIsInitialised()
    {
        return isInitialised;
    }

    //These are specially generated for the JavaSDK Sample
    public static final String WEB_LOGIN_CLIENT_ID_SHAREFILE = "tpB84u9E63jMkgLYS0Wdam6RiW0He0QH";
    public static final String WEB_LOGIN_CLIENT_SECRET_SHAREFILE = "DuYf1GOSDGeBj8yBzO0ZxIMNrsYm2pkDLJSkOQOKa0WhCmez";

    public static final String WEB_LOGIN_REDIRECT_URL = "https://secure.sharefile.com/oauthcomplete.aspx";
    public static final String CONTROL_PLANE = "sharefile.com";
    private static ISFApiClient apiClient;

    public static void setApiClient(ISFApiClient client)
    {
        apiClient = client;
    }

    public static ISFApiClient getApiClient()
    {
        return apiClient;
    }

    private static ISFAsyncTaskFactory asyncTaskFactory = new ISFAsyncTaskFactory()
    {
        @Override
        public ISFAsyncTask createNewTask()
        {
            return new SampleAsyncTask();
        }
    };

    public static void initShareFileSDK() throws SFInvalidStateException
    {
        if(WEB_LOGIN_CLIENT_ID_SHAREFILE==null || WEB_LOGIN_CLIENT_SECRET_SHAREFILE == null)
        {
            throw new SFInvalidStateException("Please define clientid/client secret in code");
        }

        SFSdk.init(WEB_LOGIN_CLIENT_ID_SHAREFILE,WEB_LOGIN_CLIENT_SECRET_SHAREFILE,WEB_LOGIN_REDIRECT_URL);

        //optional. makes life easy for Android apps.
        SFSdk.setLogger(new SFLogger());
        SFSdk.setAsyncTaskFactory(asyncTaskFactory);

        isInitialised = true;
    }


    public static void getOAuthToken(Context appContext,
                                      String userName,
                                      String password,
                                      String subdomain,
                                      IOAuthTokenCallback callback)
    {
        SFOAuth2Token token = null;

        try
        {
            token = PersistantToken.readToken(appContext);
        }
        catch (Exception e)
        {
            Log.e(TAG,"",e);
        }

        if(token == null)
        {
            ISFOAuthService oAuthService = new SFOAuthService();

            oAuthService.authenticateAsync(subdomain, CONTROL_PLANE, userName, password, callback);

            return;
        }

        callback.onSuccess(token);
    }
}
