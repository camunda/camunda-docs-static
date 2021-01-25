---

title: 'Security Policy'
weight: 30

menu:
  main:
    name: "Security Policy"
    identifier: "security-policy"

---

As a core infrastructure component of our customers, the security of Camunda Platform (also referred to as the 'software') takes top priority and is maintained constantly.


# Information Security Standards

The security of the areas listed in the next section is ensured based on common industry best practises. Thus, the development of the software is being influenced by standards like [OWASP Top 10](https://owasp.org/www-project-top-ten/)), [CVSS](https://www.first.org/cvss/) and others.

# Organizational Aspects of Security

## Roles and Responsibilities

Camunda's organizational structure includes a role dedicated to security. This role is assigned to a senior employee who is
responsible for the establishment, administration and maintenance of this policy.

## Security in context of the Systems Development Life Cycle ("SDLC")
Application and System development follows a defined methodology that contains a preliminary review of information security requirements to ensure the following minimum standards.

### Segregation of duties
Segregation of duties is incorporated into the SDLC so that a single person is unable to introduce security vulnerabilities into the software. The team responsible for software development is separated from the team responsible for the regressions testing and delivery of the software.

### On-Going Software Development
A formal change management process is used when making changes to the software which includes the following minimum standards:

1. Each code change by one software developer is reviewed and approved by a second software developer;
2. Changes to the software must not be packaged into the final software artefacts (which are provided for download to the customers) by the same person who does the development; and
3. A record of all changes to the software exists that identifies:
  * a brief description of each change that was made;
  * who made each change;
  * test cases for future automated regressions testing of this change;
  * who reviewed each change; and
  * the date and time when each change was made.

### Review Frequency
Reviews of any new major or minor release shall be conducted to revalidate the software prior to making it available for download to the Customer.

### Third Party Dependencies
Third party dependencies contained within the software are constantly being monitored. In case there are newer versions of these dependencies that include security relevant improvements, a plan to incorporate the updated versions is created.

## Onboarding of Employees

New software developers are being introduced to our security policy and best practices during their onboarding process.

# Security Issue Management

## Reporting Security Issues and Vulnerabilities

Security vulnerabilities can be reported via the Camunda JIRA issue tracker. Find details in the [Report a Vulnerability Guide]({{< ref "/report-vulnerability.md" >}}). Reported vulnerabilities, associated documentation and the identity of reporters are treated confidentially throughout the entire process.

Vulnerabilities discovered by our enterprise customers are treated as bugs and the agreed SLAs apply.

## Qualification

Once reported, Camunda proceeds to assess a vulnerability. This includes root cause analysis, as well as understanding the risk (how likely is the vulnerability to be exploited?) and impact (what can an attacker do when exploiting the vulnerability?) of the problem. This assessment is made in close collaboration with the reporter.

## Remediation

Camunda creates a remediation plan to resolve security issues that are identified. Fixes are made available in the form of patch releases (enterprise customers only) and alpha/minor releases (community platform users).

## Announcement

Once a fix release or a practicable workaround is available, Camunda informs its users on the [Security Notices]({{< ref "/notices.md" >}}) page.

# Security Acceptance and Maintenance

## Acceptance
The software shall not be considered accepted until the security review has been completed and all security issues have been assigned to a remediation plan. The security review is part of the Regression Testing.

## Automatic Regression Testing
For a release to be accepted, several automated regression tests must be passed. Testing the security relevant aspects of the software is part of this regression test.

## Manual Regression Testing
For a release to be accepted, a manual regression test must be passed. Testing the security relevant aspects of the software is part of this manual regression test.

## Penetration Testing

Camunda has contracted an independent, external security advisor to regularly conduct penetration tests of the software. The advisor operates according to industry best practices recommended by the OWASP organization such as the [OWASP Testing Guide](https://www.owasp.org/images/1/19/OTGv4.pdf). The tools used for testing include [Burp Suite](https://portswigger.net/burp) and [DefenseCode Thunderscan](https://www.defensecode.com/thunderscan.php)

Any vulnerabilities detected are handled according to our [process for security issue management](#security-issue-management).

Test history:

<table class="table table-striped">
  <tr>
    <th>Date</th>
    <th>Test Focus</th>
    <th>Result Summary</th>
  </tr>
  <tr>
    <td><p>January 2019</p></td>
    <td>
      <p>Camunda Platform version: 7.10.1</p>
      <p>Whitebox test with focus on (but not limited to) Camunda Platform web applications and REST API.</p>
    </td>
    <td>
      <p>No critical vulnerabilities were detected.</p>
      <p>Five lesser vulnerabilities were detected and submitted for treatment to our security issue process.</p>
      <p>Two issues have been fixed. </p>
      <p>Three issues have been partially fixed. </p>
    </td>
  </tr>
  <tr>
    <td><p>January 2020</p></td>
    <td>
      <p>Camunda Platform Version: 7.12.1-ee Camunda Optimize Version 2.7.0</p>
      <p>Whitebox test with focus on (but not limited to) Camunda Platform web applications and REST API.</p>
    </td>
    <td>
      <p>No critical vulnerabilities were detected.</p>
      <p>Seven lesser vulnerabilities were detected and submitted for treatment to our security issue process.</p>
      <p>Two issues have been fixed. </p>
      <p>Five issues have been partially fixed, work in progress.</p>
    </td>
  </tr>
</table>

## Automatic Virus Scans

An automatic virus scan is part of our release process. Its catalogues are up to date and it is used to scan the released distributions our users can download.
In addition automatic virus scans are being performed on our core infrastructure components.
