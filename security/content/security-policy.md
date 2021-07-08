---

title: 'Security Policy'
weight: 30

menu:
  main:
    name: "Security Policy"
    identifier: "security-policy"

---

As a core infrastructure component of our customers, the security of Camunda Platform (also referred to as the 'software') takes top priority and is maintained constantly.

For information on our Camunda Security Policy, see [camunda.com/security](https://camunda.com/security). 


## Penetration Testing

Camunda has contracted an independent, external security advisor to regularly conduct penetration tests of the software. The advisor operates according to industry best practices recommended by the OWASP organization such as the [OWASP Testing Guide](https://www.owasp.org/images/1/19/OTGv4.pdf). The tools used for testing include [Burp Suite](https://portswigger.net/burp) and [DefenseCode Thunderscan](https://www.defensecode.com/thunderscan.php)

Any vulnerabilities detected are handled according to our [process for security issue management](https://camunda.com/security#security-issue-management).

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
  <tr>
    <td><p>March 2021</p></td>
    <td>
      <p>Camunda Platform Version: 7.14.5-ee Camunda Optimize Version 3.3.0</p>
      <p>Whitebox test with focus on (but not limited to) Camunda Platform web applications and REST API.</p>
    </td>
    <td>
      <p>No critical vulnerabilities were detected.</p>
      <p>Three lesser vulnerabilities were detected and submitted for treatment to our security issue process.</p>
      <p>Three issues have been partially fixed, work in progress.</p>
    </td> 
  </tr>
  <tr>
    <td><p>June 2021</p></td>
    <td>
      <p>Cawemo</p>
      <p>Whitebox test with focus on (but not limited to) the Cawemo application and the underlying infrastructure.</p>
    </td>
    <td>
      <p>No critical vulnerabilities were detected.</p>
      <p>Five lesser vulnerabilities were detected and submitted for treatment to our security issue process.</p>
      <p>Five issues have been partially fixed, work in progress.</p>
    </td> 
  </tr>  
</table>
