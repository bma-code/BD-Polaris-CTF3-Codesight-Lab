# Black Duck Polaris - Code Sight IDE (Lab #3)

The goal of this lab is to provide hands on experience configuring Visual Studio Code to work with Polaris and run a local scan in your IDE. In this lab you will learn how to:
- install the Code Sight extension in Visual Studio Code
- configure Code Sight extension to connect to your application in Polaris
- scan your local application with Rapid Static Scan
- fix a finding once its identified
- run a full scan of your application using Polaris in your IDE

This repository contains everything you need to complete the lab except for the two prerequisites listed below.

## $\textsf{\color{#800080}{Prerequisites}}$

- [signup](https://github.com/signup) for a free GitHub Account
- [create](https://polaris.blackduck.com/developer/default/polaris-documentation/t_make-token) a Polaris Access Token
- [Microsoft Visual Studio Code](https://code.visualstudio.com/)

PART TWO: (Optional)
- Java
- Maven
- ** Mac users need Xcode (run 'xcodebuild -version' from commandline and if it fails you need to install xcode. If this still dosen't produce a version, run 'sudo xcode-select -r' from the command line and try again)


## PREPARING VS CODE
![](https://img.shields.io/badge/steps-blueviolet?style=for-the-badge)
1. If you do not already have [Microsoft Visual Studio Code](https://code.visualstudio.com/), download and install
2. Open Visual Studio Code and go to the extensions on left menu and search for Black Duck
3. Find the Purple Black Duck logo and install the **<ins>Code Sight</ins>** extension
4. Mac Users - Type: [ CMD+SHIFT+P ] This will open a search where you can type shell and choose "Shell Command: Install 'code' command in PATH"
5. Close Visual Studio Code


## CONFIGURE CODE SIGHT
![](https://img.shields.io/badge/steps-blueviolet?style=for-the-badge)
1. Download a ZIP file of this lab from [GitHub](https://github.com/itsnotjason/polaris-codesight-lab) and extract to your local computer
2. From the command line navigate to the application folder (where the pom.xml file is) and Type: [ code . ] and hit enter
3. VS Code should now appear, with your files from your folder loaded into the file explorer and a Code Sight window, "Choose a Product" should appear
4. Under the Existing Polaris user? menu, choose "Connect to Polaris"
5. Add your Polaris URL (if different than default)
6. Add your Access Token (saved from Lab#2, or create a new one)
7. Test Connection and Save Settings once successful
8. Under the Status menu on the bottom left side, click "Products and Licenses"
9. We have installed connectivity to Polaris, but there are 2 ways to run scans from Visual Studio. You can scan as you code with Rapid Scan Static which we will do as part of this lab.  You can also run a full scan with Polaris which will be part 2, an optional addition to this lab. For now, Click "Install" next to the "Code Analysis (Rapid Scan Static) under the Polaris option.


## SCAN AS YOU CODE
![](https://img.shields.io/badge/steps-blueviolet?style=for-the-badge)
1. Under the Local View on the left menu, click the gear cog to open scan settings
2. Click the [ + ] button and choose Rapid Scan Static and click Apply
3. Under the Local View on the left menu, lets change this from Manual Scan to Automatic Scan
4. In the File Explorer at the Top Left menu icon, open src/main/java > SqlInjection.java
5. Click on your Code Sight extension, and click on the vulnerability. A detailed explanation will appear with an explanation of what’s wrong and guidance on how to correct the issue.
6. Comment out the "Bad Code" and Uncomment out the "Fixed Code" and save your work. See the vulnerability disappear.
7. Open the HardCodedCredentials.java file and click back into the Code Sight extension.  Notice you have some vulnerabilities.  Find the “secret” token and complete part 1 of this lab.


## PART TWO (OPTIONAL)
## FULL POLARIS SCAN
![](https://img.shields.io/badge/steps-blueviolet?style=for-the-badge)
1. Under the Local View on the left menu, lets change the Automatic Scan mode back to Manual Scan
2. Click the [ + ] button to add scan types within the Code Sight Scan Configurations, and choose Polaris
3. Use defaults, but change "Server Projects" and set to use the application you setup in Polaris during previous Labs and click Apply
4. The Play or Run button located to the right of the Local View menu should reappear, lets click this and choose Polaris from the options
5. Once the scan is complete, and the results will appear concluding how to run a full scan with Code Sight.

# Congratulations

You have now scanned locally using Code Sight with Polaris! Keep in mind Code Sight works with Polaris, Black Duck SCA, Coverity, and Software Risk Manager as well! :clap: :trophy:

## ![](https://img.shields.io/badge/optional-CTF-blueviolet?style=for-the-badge)
Within the results in your IDE, find the secret and decode. Add this to your Lab 1, and Lab 2 findings to complete the sentence!
