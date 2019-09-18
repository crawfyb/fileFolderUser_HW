package com.codeclan.fileFolderUserHWJava.fileFolderUser.projections;

import com.codeclan.fileFolderUserHWJava.fileFolderUser.models.File;
import com.codeclan.fileFolderUserHWJava.fileFolderUser.models.Folder;
import org.springframework.data.rest.core.config.Projection;

import java.nio.file.Files;

@Projection(name = "embedFolder", types = File.class)
public interface EmbedFolder {

    String getName();
    String getExtension();
    int getSize();
    Folder getFolder();
}
