/*
 * Copyright 2008-2009 the original 赵永春(zyc@hasor.net).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.hasor.rsf.center.web.apis;
import net.hasor.mvc.api.AbstractWebController;
import net.hasor.mvc.api.MappingTo;
import net.hasor.rsf.center.client.CenterParams;
/**
 * 
 * @version : 2015年5月5日
 * @author 赵永春(zyc@hasor.net)
 */
public class OnLine extends AbstractWebController {
    @MappingTo("/apis/online")
    public void execute() {
        String hostName = this.getPara(CenterParams.Terminal_HostName);
        String hostPort = this.getPara(CenterParams.Terminal_HostPort);
        String version = this.getPara(CenterParams.Terminal_Version);
        //
        String terminalID = hostName + ":" + hostPort + ":" + System.currentTimeMillis();
        String terminalAccessKey = hostName + ":" + hostPort + ":" + System.currentTimeMillis();
        this.setHeader(CenterParams.Terminal_ID, terminalID);
        this.setHeader(CenterParams.Terminal_AccessKey, terminalAccessKey);
        System.out.println("/apis/online");
    }
}