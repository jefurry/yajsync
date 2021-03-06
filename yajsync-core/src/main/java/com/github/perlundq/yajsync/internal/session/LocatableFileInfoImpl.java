/*
 * Copyright (C) 2016 Per Lundqvist
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.github.perlundq.yajsync.internal.session;

import java.nio.file.Path;

import com.github.perlundq.yajsync.attr.LocatableFileInfo;
import com.github.perlundq.yajsync.attr.RsyncFileAttributes;

class LocatableFileInfoImpl extends FileInfoImpl implements LocatableFileInfo
{
    private final Path _path;

    LocatableFileInfoImpl(String pathName, byte[] pathNameBytes,
                          RsyncFileAttributes attrs, Path path)
    {
        super(pathName, pathNameBytes, attrs);
        assert path != null;
        assert path.isAbsolute();
        _path = path;
    }

    @Override
    public Path path()
    {
        return _path;
    }
}
