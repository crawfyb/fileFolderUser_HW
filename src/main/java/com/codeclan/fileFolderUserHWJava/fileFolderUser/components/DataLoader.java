package com.codeclan.fileFolderUserHWJava.fileFolderUser.components;

import com.codeclan.fileFolderUserHWJava.fileFolderUser.models.File;
import com.codeclan.fileFolderUserHWJava.fileFolderUser.models.Folder;
import com.codeclan.fileFolderUserHWJava.fileFolderUser.models.User;
import com.codeclan.fileFolderUserHWJava.fileFolderUser.repository.FileRepository;
import com.codeclan.fileFolderUserHWJava.fileFolderUser.repository.FolderRepository;
import com.codeclan.fileFolderUserHWJava.fileFolderUser.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Component;

@Component
public class DataLoader {

    @Autowired
    UserRepository userRepository;

   @Autowired
   FolderRepository folderRepository;

    @Autowired
    FileRepository fileRepository;

    public DataLoader() {
    }

    public void run(ApplicationArguments args) {
        User gav = new User("Gav");
        userRepository.save(gav);

        Folder documents = new Folder("Documents", gav);
        folderRepository.save(documents);

        File resume = new File("resume", "word", 200, documents);

    }

    }



