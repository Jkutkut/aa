/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   ft_strncat.c                                       :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: jre-gonz <jre-gonz@student.42madrid.com>   +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2022/01/18 11:30:18 by jre-gonz          #+#    #+#             */
/*   Updated: 2022/01/18 11:30:24 by jre-gonz         ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

char	*ft_strncat(char *dest, char *src, unsigned int nb)
{
	unsigned int	i;
	unsigned int	l;

	i = 0;
	while (dest[i])
		i++;
	l = i;
	while (*src && i - l < nb)
	{
		dest[i++] = *src;
		src++;
	}
	dest[i] = 0;
	return (dest);
}
