/*
 * Copyright 2012-2013 Sebastien Zurfluh
 * 
 * This file is part of "Swiss Museum Guides".
 * 
 * "Swiss Museum Guides" is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * "Swiss Museum Guides" is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 *  You should have received a copy of the GNU General Public License
 *  along with "Swiss Museum Guides".  If not, see <http://www.gnu.org/licenses/>.
 */

package ch.sebastienzurfluh.swissmuseumguides.contentprovider.model.io.interfaces;

import android.database.Cursor;

/**
 * Get the needed data from the DB.
 * This interface provides higher order queries than the BasicInputConnector.
 *
 * @author Sebastien Zurfluh
 *
 */
public interface IConnector {
	
	/**
	 * @param groupId
	 * @return the list of all the pages' menus in the given group
	 */
	Cursor getPagesMenusInGroup(int groupId);
	
	
	/**
	 * @return the list of all the pages' menus
	 */
	Cursor getAllPagesMenus();
	
	
	
	/**
	 * @param pageId
	 * @return the bare page
	 */
	Cursor getPage(int pageId);


    /**
     * @param resourceId
     * @return the resource url and legend
     */
    Cursor getResource(int resourceId);

    /**
     * @return the list of all the groups' menus
     */
    Cursor getAllGroupMenus();
}