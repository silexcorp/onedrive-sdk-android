// ------------------------------------------------------------------------------
// Copyright (c) 2015 Microsoft Corporation
// 
// Permission is hereby granted, free of charge, to any person obtaining a copy
// of this software and associated documentation files (the "Software"), to deal
// in the Software without restriction, including without limitation the rights
// to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
// copies of the Software, and to permit persons to whom the Software is
// furnished to do so, subject to the following conditions:
// 
// The above copyright notice and this permission notice shall be included in
// all copies or substantial portions of the Software.
// 
// THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
// IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
// FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
// AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
// LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
// OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
// THE SOFTWARE.
// ------------------------------------------------------------------------------

package com.onedrive.sdk.generated;

import com.onedrive.sdk.concurrency.*;
import com.onedrive.sdk.core.*;
import com.onedrive.sdk.extensions.*;
import com.onedrive.sdk.http.*;
import com.onedrive.sdk.generated.*;
import com.onedrive.sdk.options.*;
import com.onedrive.sdk.serializer.*;

import java.util.*;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Share Request.
 */
public class BaseShareRequest extends BaseRequest implements IBaseShareRequest {

    /**
     * The request for the Share
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param options The options for this request
     */
    public BaseShareRequest(String requestUrl, IOneDriveClient client, List<Option> options) {
        super(requestUrl, client, options, Share.class);
    }

    public void get(final ICallback<Share> callback) {
        send(HttpMethod.GET, callback, null);
    }

    public Share get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * @deprecated  As of release 1.1.3, replaced by {@link #patch(Share, ICallback)}
     */
    @Deprecated public void update(final Share sourceShare, final ICallback<Share> callback) {
        this.patch(sourceShare, callback);
    }

    /**
     * @deprecated  As of release 1.1.3, replaced by {@link #patch(Share)}
     */
    @Deprecated public Share update(final Share sourceShare) throws ClientException {
        return this.patch(sourceShare);
    }

    public void patch(final Share sourceShare, final ICallback<Share> callback) {
        send(HttpMethod.PATCH, callback, sourceShare);
    }

    public Share patch(final Share sourceShare) throws ClientException {
        return send(HttpMethod.PATCH, sourceShare);
    }

    public void delete(final ICallback<Void> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    public void delete() throws ClientException {
        send(HttpMethod.DELETE, null);
    }

    /**
     * @deprecated  As of release 1.1.3, replaced by {@link #post(Share, ICallback)}
     */
    @Deprecated public void create(final Share newShare, final ICallback<Share> callback) {
        this.post(newShare, callback);
    }

    /**
     * @deprecated  As of release 1.1.3, replaced by {@link #post(Share)}
     */
    @Deprecated public Share create(final Share newShare) throws ClientException {
        return this.post(newShare);
    }

    public void post(final Share newShare, final ICallback<Share> callback) {
        send(HttpMethod.POST, callback, newShare);
    }

    public Share post(final Share newShare) throws ClientException {
        return send(HttpMethod.POST, newShare);
    }

    public IShareRequest select(final String value) {
        getQueryOptions().add(new QueryOption("select", value));
        return (ShareRequest)this;
    }

    public IShareRequest top(final int value) {
        getQueryOptions().add(new QueryOption("top", value+""));
        return (ShareRequest)this;
    }

    public IShareRequest expand(final String value) {
        getQueryOptions().add(new QueryOption("expand", value));
        return (ShareRequest)this;
    }
}
