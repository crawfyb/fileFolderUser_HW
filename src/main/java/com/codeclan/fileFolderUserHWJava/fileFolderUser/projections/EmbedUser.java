package com.codeclan.fileFolderUserHWJava.fileFolderUser.projections;

import com.codeclan.fileFolderUserHWJava.fileFolderUser.models.Folder;
import com.codeclan.fileFolderUserHWJava.fileFolderUser.models.User;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "embedUser", types = Folder.class)
public interface EmbedUser {

  String getTitle();
  User getUser();
}
