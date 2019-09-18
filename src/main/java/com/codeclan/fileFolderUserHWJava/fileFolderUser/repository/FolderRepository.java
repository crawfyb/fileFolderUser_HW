package com.codeclan.fileFolderUserHWJava.fileFolderUser.repository;

import com.codeclan.fileFolderUserHWJava.fileFolderUser.models.Folder;
import com.codeclan.fileFolderUserHWJava.fileFolderUser.projections.EmbedUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = EmbedUser.class)
public interface FolderRepository extends JpaRepository<Folder, Long> {
}
