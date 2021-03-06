package railo.commons.io.res.filter;

import railo.commons.io.res.Resource;

/**
 * accept only directories
 */
public final class DirectoryResourceFilter implements ResourceFilter {

    public final static DirectoryResourceFilter FILTER = new DirectoryResourceFilter();

	/**
     *
     * @see railo.commons.io.res.filter.ResourceFilter#accept(railo.commons.io.res.Resource)
     */
    public boolean accept(Resource pathname) {
        return pathname.isDirectory();
    }

}