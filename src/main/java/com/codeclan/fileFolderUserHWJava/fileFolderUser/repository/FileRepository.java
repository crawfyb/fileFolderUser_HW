package com.codeclan.fileFolderUserHWJava.fileFolderUser.repository;

import com.codeclan.fileFolderUserHWJava.fileFolderUser.models.File;
import com.codeclan.fileFolderUserHWJava.fileFolderUser.projections.EmbedFolder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = EmbedFolder.class)
public interface FileRepository extends JpaRepository<File, Long> {
}
