# Black Duck Polaris - Code Sight IDE (Lab #3)

The goal of this lab is to provide hands on experience configuring Visual Studio Code to work with Polaris and run a local scan in your IDE. In this lab you will learn how to:
- install the Code Sight extension in Visual Studio Code
- configure Code Sight extension to connect to your application in Polaris
- scan your local application
- fix a finding once its identified

This repository contains everything you need to complete the lab except for the two prerequisites listed below.

# Prerequisites

1. [signup](https://github.com/signup) for a free GitHub Account
2. [create](https://polaris.synopsys.com/developer/default/polaris-documentation/t_make-token) a Polaris Access Token

# Clone repository

1. Clone this repository into your GitHub account. _GitHub → New → Import a Repository_ **Milestone 1** :heavy_check_mark:
   - enter https://github.com/itsnotjason/polaris-github-lab-java.git
   - enter repository name, e.g. polaris-github-lab-java
   - leave as public (required for GHAS on free accounts)

# Setup workflow

1. Confirm GITHUB_TOKEN has workflow read & write permissions. _GitHub → Project → Settings → Actions → General → Workflow Permissions_
2. Confirm all GitHub Actions are allowed. _GitHub → Project → Settings → Actions → General → Actions Permissions_
3. Add the following variables, adding POLARIS_ACCESSTOKEN as a **secret**. _GitHub → Project → Settings → Secrets and Variables → Actions_
   - POLARIS_SERVERURL
   - POLARIS_ACCESSTOKEN
4. Add a coverity.yaml to the project repository. _GitHub → Project → Add file → Create new file_

```
capture:
  build:
    clean-command: mvn -B clean
    build-command: mvn -B -DskipTests package
analyze:
  checkers:
    webapp-security:
      enabled: true
```

# Full Scan

1. Monitor your workflow run and wait for scan to complete. _GitHub → Project → Actions → Polaris → Most recent workflow run → Polaris_
   - Note that scan completes, and the workflow passes. This is because the default policy is notify on critical & high issues.
2. From the Polaris UI, [create a policy](https://polaris.synopsys.com/developer/default/polaris-documentation/t_post_scan_policies) that breaks the build and assign it to your project.
3. Rerun workflow, and once it completes, select _Summary_ in upper left to see policy enforcement and a failed workflow. **Milestone 3** :heavy_check_mark:
4. View findings in GitHub Advanced Security tab _GitHub → Project → Security → Code scanning_ **Milestone 4** :heavy_check_mark:

# PR scan

1. Edit pom.xml _GitHub → Project → Code → pom.xml → Edit pencil icon upper right_
   - change log4j version from 2.14.1 to 2.15.0
3. Click on _Commit Changes_, select create a **new branch** and start a PR
4. Review changes and click on _Create Pull Request_
5. Monitor workflow run _GitHub → Project → Actions → Polaris → Most recent workflow run → Polaris_
6. Once workflow completes, navigate back to PR and see PR comment **Milestone 5** :heavy_check_mark: _GitHub → Project → Pull requests

# Congratulations

You have now configured a Polaris workflow in GitHub and demonstrated all the current post-scan CI features. :clap: :trophy:

# CTF (Optional)

Capture the value from the secret and assemble a 3 part sentance in order. 
