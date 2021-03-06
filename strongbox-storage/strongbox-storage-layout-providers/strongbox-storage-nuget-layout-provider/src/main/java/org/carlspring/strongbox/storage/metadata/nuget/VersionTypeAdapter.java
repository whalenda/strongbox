/*
 * Copyright 2019 Carlspring Consulting & Development Ltd.
 * Copyright 2014 Dmitry Sviridov
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.carlspring.strongbox.storage.metadata.nuget;

import javax.xml.bind.annotation.adapters.XmlAdapter;

import org.semver.Version;

/**
 * @author Dmitry Sviridov
 */
public class VersionTypeAdapter extends XmlAdapter<String, Version>
{

    @Override
    public String marshal(Version version)
        throws Exception
    {
        if (version == null)
        {
            return null;
        }
        else
        {
            return version.toString();
        }
    }

    @Override
    public Version unmarshal(String string)
        throws Exception
    {
        if (string == null)
        {
            return null;
        }
        else
        {
            return Version.parse(string);
        }
    }
}
