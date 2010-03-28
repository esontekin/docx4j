/*
 *  Copyright 2007-2008, Plutext Pty Ltd.
 *   
 *  This file is part of docx4j.

    docx4j is licensed under the Apache License, Version 2.0 (the "License"); 
    you may not use this file except in compliance with the License. 

    You may obtain a copy of the License at 

        http://www.apache.org/licenses/LICENSE-2.0 

    Unless required by applicable law or agreed to in writing, software 
    distributed under the License is distributed on an "AS IS" BASIS, 
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
    See the License for the specific language governing permissions and 
    limitations under the License.

 */

package org.docx4j.openpackaging.parts.WordprocessingML;

import java.io.IOException;
import java.io.InputStream;

import org.docx4j.openpackaging.contenttype.ContentTypes;
import org.docx4j.openpackaging.exceptions.InvalidFormatException;
import org.docx4j.openpackaging.parts.ExternalTarget;
import org.docx4j.openpackaging.parts.Part;
import org.docx4j.openpackaging.parts.PartName;
import org.docx4j.openpackaging.parts.relationships.Namespaces;


public class ImageGifPart extends BinaryPartAbstractImage {
	
	public ImageGifPart(PartName partName) throws InvalidFormatException {
		super(partName);
		init();
	}

//	public ImageGifPart() throws InvalidFormatException {
//		super(new PartName( generateName() + "." + ContentTypes.EXTENSION_GIF ));
//		init();
//	}
	
	public ImageGifPart(ExternalTarget externalTarget) {
		super(externalTarget);
		init();
	}	
	
	public void init() {
		// Used if this Part is added to [Content_Types].xml 
		setContentType(new  org.docx4j.openpackaging.contenttype.ContentType( 
				org.docx4j.openpackaging.contenttype.ContentTypes.IMAGE_PNG));

		// Used when this Part is added to a rels 
		setRelationshipType(Namespaces.IMAGE);
	}
	
		
}
