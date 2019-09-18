package com.codeclan.fileFolderUserHWJava.fileFolderUser;

import com.codeclan.fileFolderUserHWJava.fileFolderUser.models.Folder;
import com.codeclan.fileFolderUserHWJava.fileFolderUser.models.User;
import com.codeclan.fileFolderUserHWJava.fileFolderUser.repository.FileRepository;
import com.codeclan.fileFolderUserHWJava.fileFolderUser.repository.FolderRepository;
import com.codeclan.fileFolderUserHWJava.fileFolderUser.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FileFolderUserApplicationTests {

	@Autowired
	FileRepository fileRepository;

	@Autowired
	FolderRepository folderRepository;

	@Autowired
	UserRepository userRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void createFolderAndUserThenSave() {
		User gav = new User("Gav");
		userRepository.save(gav);

		Folder documents = new Folder("Documents", gav);
		folderRepository.save(documents);
	}

}
