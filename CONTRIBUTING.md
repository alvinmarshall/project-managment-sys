# Contributing

When contributing to this repository, please first discuss the change you wish to make via issue, email, or any other method with the owners of this repository before making a change.

Please note we have a code of conduct, please follow it in all your interactions with the project.

## Pull Requests

1. Ensure any install or build dependencies are removed before the end of the layer when doing a build.
2. Update the README.md with details of changes to the interface, this includes new environment variables, exposed ports, useful file locations and container parameters.
3. We strictly use GitFlow and try to have a linear merge. Please follow the guidelines below.

## Git Flow

1. Navigate to the [Bik-Krlvn/project-mgt-sys](https://github.com/Bik-Krlvn/project-mgt-sys) repository and click on Fork button.  

2. You'll either find a way to fork to your own account or you will have a link to go to your forked repository. Clicking on either takes you to the forked repository.  

3. You can confirm that this repository is a fork of the original repository by finding the "forked from [Bik-Krlvn/project-mgt-sys](https://github.com/Bik-Krlvn/project-mgt-sys)" text under the repository name.  
 
4. Click on Clone or download button on the forked repository. Make sure you are cloning your version (GitHub.com/\<your username>/project-mgt-sys)  
5. I use a `git clone` command with my username attached in front of the `github.com`, making the clone command look like `git clone https://github.com/Bik-Krlvn/project-mgt-sys.git`. This is for making sure, the compatibility is maximum.  
6. Let's say I am going to start working on the `Issue #2`. Create a new branch with the format of `issue#-subject`, here it is `2-cname-update`. I use command line a lot so I am confident of what command I am using. If you're comfortable with GUI, feel free to use it, but make sure you use the right naming convention. The complete command I have used here is `git checkout -b 2-cname-update`.  
7. Make all your changes in your favourite IDE. Make sure you adhere to the linting rules from prettier
8. Once you make changes, you can see the changed files. Make sure no unintended changes are there (new files added, changed files aren't recognised, etc.), which you can see by checking the `git status` command and looking at the workspace.  
9. Use a good diff tool to check if the changes are indeed intended. I use `git diff --color` to check the diffs between the changes.  
10. If everything looks alright, add the files to staging by using `git add <filename>`. If you want to add all the files and if there are many files, you can use `git add .`. Use `git status` again to verify the changes that are added.  
11. Once you have added the files to staging and checked the integrity of changes, you can start writing the commit message. The commit message should follow [Git Standards followed in our way of Spotify Agile Methodology](https://blog.praveen.science/git-standards-followed-in-our-way-of-spotify-agile-methodolgy/). The main two points you need to note are 50 characters for commit subjects and 72 characters for commit message lines. At the end of the commit message, make sure you write `Fixes #<issue number>.`. We are following sentence case everywhere and a past tense. Please follow the same. When you push for the first time, please use the `-u` flag and give the full branch name. As my branch name is `2-cname-update` and this is the first time I am pushing, I will do `git push -u origin 2-cname-update`. Once you do this, the command automatically gives you the link for creating Pull Request as a response from remote. In my case, it was `https://github.com/Bik-Krlvn/project-mgt-sys/pull/new/2-cname-update`.  
12. Either navigate to the URL that you received in the above step or just go to your repository. You can see a banner informing you about your recently pushed branches and will also give you an option to Compare & pull request. Click on the button to open the pull request.  
13. In the Open a pull request page, you will be shown with the commit details. Make sure you enter a valid commit message explaining what you have done and give a few points on what has happened. Don't forget to add the last line `Fixes #<issue number>.` at the end. Also, make sure to notify the admin of the project by clicking on the gear icon next to Reviewers on the right side. Click on Create pull request to create the pull request for review.  
14. Here you have created the pull request successfully. You can check the correct number of commits and the files changed are perfect here. One of the reviewers will be with you shortly to 