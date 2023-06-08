// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.iam;

import com.databricks.sdk.support.Generated;

/**
 * These APIs manage access rules on resources in an account. Currently, only grant rules are
 * supported. A grant rule specifies a role assigned to a set of principals. A list of rules
 * attached to a resource is called a rule set.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface AccountAccessControlService {
  /**
   * Get a rule set.
   *
   * <p>Get a rule set by its name. A rule set is always attached to a resource and contains a list
   * of access rules on the said resource. Currently only a default rule set for each resource is
   * supported.
   */
  RuleSetResponse get(GetAccountAccessControlRequest getAccountAccessControlRequest);

  /**
   * List assignable roles on a resource.
   *
   * <p>Gets all the roles that can be granted on an account level resource. A role is grantable if
   * the rule set on the resource can contain an access rule of the role.
   */
  GetAssignableRolesForResourceResponse list(
      ListAccountAccessControlRequest listAccountAccessControlRequest);

  /**
   * Update a rule set.
   *
   * <p>Replace the rules of a rule set. First, use get to read the current version of the rule set
   * before modifying it. This pattern helps prevent conflicts between concurrent updates.
   */
  RuleSetResponse update(UpdateRuleSetRequest updateRuleSetRequest);
}
